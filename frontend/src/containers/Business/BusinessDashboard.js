import React, { Component } from 'react';
import Aux from '../../hoc/AuxComponent';
import ShowUsers from '../../components/User/ShowUsers';
import ShowBusinesses from '../../components/Business/ShowBusinesses';
import CreateBusinessGroup from "../../components/Business/CreateBusinessGroup";
import $ from 'jquery';

class BusinessDashboard extends Component {
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
    let showBusinesses = <CreateBusinessGroup />;
    if(this.state.businessGroup.basicDetails){
      showBusinesses=<ShowBusinesses businessGroup={this.state.businessGroup}/>;
    }
    return (
      <Aux>
        <h3>BusinessDashboard</h3>
        {showBusinesses}
        < ShowUsers/>
      </Aux>
    );
  }
}

export default BusinessDashboard;
