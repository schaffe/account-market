import { Link } from 'react-router-dom';
import React from 'react';

export default () => (
  <header>
    <ul>
      <li>
        <Link to="/">Home</Link>
      </li>
      <li>
        <Link to="/sell">Sell account</Link>
      </li>
      <li>
        <Link to="/buy">Buy account</Link>
      </li>
      <li>
        <Link to="/help">Help</Link>
      </li>
      <li>
        <Link to="/about">About</Link>
      </li>
    </ul>
  </header>
);
