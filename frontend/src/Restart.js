import React from 'react';

class Restart extends React.Component {

   constructor(props) {
      super(props);

      this.state = {
      }

      this.updateState = this.updateState.bind(this);
   };

   updateState() {
     fetch('/reset', {
       method: 'PUT',
       headers: {
         'Accept': 'application/json',
         'Content-Type': 'application/json',
       },
       body: JSON.stringify("true"),
     }).then(response => response)
       .then(response => {
         window.location.reload(true);
     })

   }

   render() {
      return (
         <div>
            <Content myDataProp = {this.state.data}
               updateStateProp = {this.updateState}></Content>
         </div>
      );
   }
}

class Content extends React.Component {

   render() {
      return (
         <div id ="resetButton">
            <button onClick = {this.props.updateStateProp}>Restart Game</button>
            <h3>{this.props.myDataProp}</h3>
         </div>
      );
   }
}

export default Restart;
