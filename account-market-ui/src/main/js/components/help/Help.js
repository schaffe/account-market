import React from 'react';
import { Link, Route } from 'react-router-dom';

const Topic = ({ match }) => (
  <div>
    <h3>{match.params.topicId}</h3>
  </div>
);

export default ({ match }) => (
  <div>
    <h2>Help center</h2>
    <ul>
      <li>
        <Link to={`${match.url}/how-to-buy`}>How to buy account</Link>
      </li>
      <li>
        <Link to={`${match.url}/is-it-safe`}>Is it safe?</Link>
      </li>
    </ul>

    <Route path={`${match.url}/:topicId`} component={Topic} />
    <Route
      exact
      path={match.url}
      render={() => <h3>Please select a topic.</h3>}
    />
  </div>
);
