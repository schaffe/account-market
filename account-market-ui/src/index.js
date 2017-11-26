import React from 'react';
import ReactDOM from 'react-dom';
import AppRouter from './main/js/router/AppRouter';
import registerServiceWorker from './registerServiceWorker';

ReactDOM.render(<AppRouter />, document.getElementById('root'));
registerServiceWorker();
