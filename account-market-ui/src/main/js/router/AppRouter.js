/**
 * @link https://medium.com/@pshrmn/a-simple-react-router-v4-tutorial-7f23ff27adf
 */
import React, { Component } from 'react';
import { Route, Switch } from 'react-router';
import App from '../components/app/App';
import { BrowserRouter } from 'react-router-dom';

class AppRouter extends Component {
  render() {
    return (
      <BrowserRouter>
        <Switch>
          <Route exact path="/" component={App} />
        </Switch>
      </BrowserRouter>
    );
  }
}

export default AppRouter;
