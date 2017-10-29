import React, { Component } from 'react';
import './App.css';
import Board from './Board.js';
import Restart from './Restart.js';

class App extends Component {
	constructor() {
	super()
	this.state = {
		board: Board,
		text: ''
	}
  }
 	componentDidMount() {
		fetch('/wins').then(response => response.json())
          .then(response => {
              console.log(response);
              this.setState({
                  winsCount: response
                })
            })
	}

	clicked(event) {
        var myNumb = parseInt(event.target.id.toString(),10);
        fetch('/markBoard', {
          method: 'PUT',
          headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
          },
          body: JSON.stringify(myNumb),
	  }).then(response => response)
        .then(response => {
			window.location.reload(true);
        })
	}
  render() {
	  
	  
	  if(!this.state.winsCount){
		  return (<div></div>)
	  }
	  return (
		  <div id="game">
	          <div id ="head">
	          </div>
	          <div id="gameboard" onClick={(e)=>this.clicked(e)}>
			  <Board />
	          </div>
				<Restart/>
				<div>X wins: {this.state.winsCount.x} </div>
				<div>O wins: {this.state.winsCount.o} </div>
	        </div>
		)
  }
}

export default App;
