import React, { Component } from 'react';

class Login extends Component {
  constructor(){
    super();
    this.state = {
        username: "DEFAULT_USER"
    }
  }
  render() {
    return (
      <div className="Login">
        <div>
            <h2>Login Page</h2>
            <h3>{this.state.username}</h3>
        </div>
      </div>
    );
  }
}

export default Login;
