import React, { Component } from 'react';
import SignUp from "./SignUp";
import Login from "./Login";

class LoginSection extends Component {
    constructor(){
        super();
        this.state = {
          signUpClick: false,
          logInClick: false
        }
    }
  signUpClick(e){
    this.setState({signUpClick:true});
    console.log("signUpClicked");
  }
  logInClick(e){
    this.setState({logInClick:true});
    console.log("loginClicked");
  }
  setDisplayFalse(){
      this.setState({signUpClick:false});
      this.setState({logInClick:false});
  }
  render() {
    return (
        <div class="LoginSection">
           <ul class="nav justify-content-end"> 
                <li class="nav-item">
                    <a class="nav-link active" href="#" onClick={this.signUpClick.bind(this)}>Are you a Business?</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" onClick={this.logInClick.bind(this)}>Login</a>
                </li>
            </ul>
            <div><SignUp setDisplayFalse={this.setDisplayFalse.bind(this)} signUpClick={this.state.signUpClick}/></div>
            <div><Login setDisplayFalse={this.setDisplayFalse.bind(this)} logInClick={this.state.logInClick}/></div>
        </div>
    );
  }
}

export default LoginSection;