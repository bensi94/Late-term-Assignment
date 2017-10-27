import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';

ReactDOM.render(<App />, document.getElementById('root'));
registerServiceWorker();

App.set( 'port', ( process.env.PORT || 5000 ));

// Start node server
App.listen( App.get( 'port' ), function() {
  console.log( 'Node server is running on port ' + App.get( 'port' ));
  });
