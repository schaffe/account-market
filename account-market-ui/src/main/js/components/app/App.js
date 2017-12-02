import React, { Component } from 'react';
import './App.css';
import { Route } from 'react-router-dom';
import Header from './Header';
import Help from '../help/Help';

const Home = () => (
  <div>
    <h2>Home</h2>
  </div>
);

const Sell = () => (
  <div>
    <h2>Sell account</h2>
  </div>
);

const Buy = () => (
  <div>
    <h2>Buy account</h2>
  </div>
);

const About = () => (
  <div>
    <h2>About</h2>
  </div>
);

class App extends Component {
  render() {
    return (
      <div>
        <Header />

        <Route exact path="/" component={Home} />
        <Route path="/about" component={About} />
        <Route path="/sell" component={Sell} />
        <Route path="/buy" component={Buy} />
        <Route path="/help" component={Help} />
      </div>
    );
  }
}

export default App;
