import React, { Component } from 'react';
import ShowUsers from './ShowUsers';
import ShowBusinesses from './ShowBusinesses';

class BusinessUserPanel extends Component {
  handleDelete(id){
    this.props.handleDelete(id);
  }
  render() {
    return (
      <div className="BusinessUserPanel">
        <div>
            <h3>BusinessUserPanel</h3>
            <ShowUsers/>
            <ShowBusinesses/>
        </div>
      </div>
    );
  }
}

export default BusinessUserPanel;
