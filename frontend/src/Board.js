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
        fetch('/Winner').then(response => response.json())
          .then(response => {
              console.log(response);
              this.setState({
                  winnerData: response
                })
            })
    }
  render() {
      if(this.state.boardData && this.state.winnerData){
         var board = [];
         var winner = [];
          if(this.state.winnerData.Winner !== -1){
            winner.push(<div><p>Player {this.state.winnerData.Winner} Won!</p></div>);
        }

         for (var i = 1; i < 10; i++){
               board.push(<div className="square" data-square={i} id={i}>{this.state.boardData.board[i-1].square}</div>);
           }
    }
    if (!this.state.boardData || !this.state.winnerData) return <p> Loading...</p>
    return (
      <div id="tester">
     <div id="gameboard"> {board} </div>
     <div id="winner"> {winner} </div>
     </div>
    );
  }
}

export default Board;
