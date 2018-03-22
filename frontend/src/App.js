import React, { Component } from 'react';
import LoginSection from "./screens/login/LoginSection";
import BusinessUserPanel from  "./screens/businessuser/BusinessUserPanel";
import './App.css';

class App extends Component {
  
  render() {
    return (
      <div className="App">
        <div class="container-fluid">
          <LoginSection/>
          <BusinessUserPanel/>
        </div>
      </div>
    );
  }
}

export default App;
