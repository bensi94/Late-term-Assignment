import React, { Component } from 'react';
import './App.css';
import Board from './Board.js';

class App extends Component {
	constructor() {
	super()
	this.state = {
		board: Board,
		text: ''
	}
  }
 	componentDidMount() {
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

	  return (
		  <div id="game">
	          <div id ="head">
	          </div>
	          <div id="gameboard" onClick={(e)=>this.clicked(e)}>
			  <Board />
	          </div>
	        </div>
		)
  }
}

export default App;
