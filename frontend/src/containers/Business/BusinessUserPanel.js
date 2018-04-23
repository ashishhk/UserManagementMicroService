import React, { Component } from 'react';
import Aux from '../../hoc/AuxComponent';
import ShowUsers from '../User/ShowUsers';
import ShowBusinesses from './ShowBusinesses';
import classes from './Business.css';
import $ from 'jquery';

class BusinessUserPanel extends Component {
  constructor() {
    super();
    this.state = {
      businessGroup: {}
    }
  }

  init() {
    this.loadBusinesses();
  }
  loadBusinesses() {
    $.ajax({
      url: 'http://localhost:8080/rest/v1/businessgroup/getById/1',
      method: 'GET',
      dataType: 'json',
      cache: false,
      success: function (data) {
        this.setState({ businessGroup: data });
      }.bind(this),
      error: function (xhr, status, error) {
        console.log(error);
      }
    });
  }

  componentWillMount() {
    this.init();
  }
  handleDelete(id) {
    this.props.handleDelete(id);
  }
  handleDelete(id) {
    this.props.handleDelete(id);
  }
  render() {
    let showBusinesses;
    if(this.state.businessGroup.basicDetails){
      showBusinesses=<ShowBusinesses businessGroup={this.state.businessGroup}/>;
    }
    return (
      <Aux className={classes.Center}>
        <h3>BusinessUserPanel</h3>
        {showBusinesses}
        < ShowUsers className={classes.UserSection}/>
      </Aux>
    );
  }
}

export default BusinessUserPanel;
