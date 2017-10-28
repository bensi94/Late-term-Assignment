import React, { Component } from 'react';
import './App.css';

class App extends Component {

	clicked(event) {
		console.log(event.target);
	}
  render() {
    return (
      <div id="game">
        <div id ="head">
          Team Lannisters Tic Tac Toe
        </div>
        <div id="gameboard" onClick={(e)=>this.clicked(e)}>
        	<div className="square" data-square="1"></div>
					<div className="square" data-square="2"></div>
					<div className="square" data-square="3"></div>
					<div className="square" data-square="4"></div>
					<div className="square" data-square="5"></div>
					<div className="square" data-square="6"></div>
					<div className="square" data-square="7"></div>
					<div className="square" data-square="8"></div>
					<div className="square" data-square="9"></div>
        </div>
      </div>
    );
  }
}

export default App;
