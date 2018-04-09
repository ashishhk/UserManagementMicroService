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
  header()
    {
      <div>  <ul className="nav justify-content-end"> 
            <li className="nav-item">
                
            </li>
            <li className="nav-item">
                
            </li>
        </ul>
        
    </div>
    }  
  render() {
    return (
        <div className="LoginSection">
             <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
             <a className="nav-link" href="#" onClick={this.logInClick.bind(this)}>Login</a>
             <a className="nav-link active" href="#" onClick={this.signUpClick.bind(this)}>Are you a Business?</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                        <a class="nav-link" href="#">Billing Info</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Reports</a>
                        </li>
                    </ul>
                    <form class="form-inline mt-2 mt-md-0">
                        <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search"/>
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </nav>
            <div><SignUp setDisplayFalse={this.setDisplayFalse.bind(this)} signUpClick={this.state.signUpClick}/></div>
            <div><Login setDisplayFalse={this.setDisplayFalse.bind(this)} logInClick={this.state.logInClick}/></div>
        </div>
    );
  }
}

export default LoginSection;