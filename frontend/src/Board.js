import React from 'react';
import './App.css';

class Board extends React.Component {
    constructor() {
    super()
    this.state = {}
    }

    componentDidMount() {
      fetch('/board').then(response => response.json())
        .then(response => {
            console.log(response);
            this.setState({
                boardData: response
            })
        })
    }
  render() {
      if(this.state.boardData){
         var board = [];
         for (var i = 0; i < 9; i++){
               board.push(<div className="square" data-square={i+1} id={i+1}>{this.state.boardData.board[i].square}</div>);
           }
    }
    if (!this.state.boardData) return <p> Loading...</p>
    return (
     <div> {board} </div>
    );
  }
}

export default Board;
