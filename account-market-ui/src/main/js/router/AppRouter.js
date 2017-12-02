/**
 * @link https://medium.com/@pshrmn/a-simple-react-router-v4-tutorial-7f23ff27adf
 */
import React, { Component } from 'react';
import { BrowserRouter } from 'react-router-dom';
import App from '../components/app/App';

class AppRouter extends Component {
  render() {
    return (
      <BrowserRouter>
        <App />
      </BrowserRouter>
    );
  }
}

export default AppRouter;
