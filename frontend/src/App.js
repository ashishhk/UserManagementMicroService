import React, { Component } from 'react';
import Layout from './components/Layout/Layout';
import BusinessDashboard from './containers/Business/BusinessDashboard';
import SearchPortal from './containers/Search/SearchPortal';
import './App.css';

class App extends Component {
  state = {
    searchPortalVisible: true,
    loginHomeVisible: true,
  }
  render() {
    return (
      <Layout loginHomeVisible={this.state.loginHomeVisible}>
        {this.state.searchPortalVisible?<SearchPortal/>:<BusinessDashboard/>}
      </Layout>
    );
  }
}

export default App;
