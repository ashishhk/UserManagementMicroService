import React, { Component } from 'react';
import SignUp from "../signup/SignUp";
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
        <div className="LoginSection">
           <ul className="nav justify-content-end"> 
                <li className="nav-item">
                    <a className="nav-link active" href="#" onClick={this.signUpClick.bind(this)}>Are you a Business?</a>
                </li>
                <li className="nav-item">
                    <a className="nav-link" href="#" onClick={this.logInClick.bind(this)}>Login</a>
                </li>
            </ul>
            <div><SignUp setDisplayFalse={this.setDisplayFalse.bind(this)} signUpClick={this.state.signUpClick}/></div>
            <div><Login setDisplayFalse={this.setDisplayFalse.bind(this)} logInClick={this.state.logInClick}/></div>
        </div>
    );
  }
}

export default LoginSection;