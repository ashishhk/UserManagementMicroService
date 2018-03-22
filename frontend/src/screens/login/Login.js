import React, { Component } from 'react';
import Popup from "reactjs-popup";

class Login extends Component {
  constructor(){
    super();
    this.state = {
        username: "DEFAULT_USER",
        open: false
    }
  }
  componentWillReceiveProps(){
    this.setState({open:this.props.logInClick});
  }
  closeModal = () => {
    this.setState({ open: false });
    this.props.setDisplayFalse();
  };

  handleSubmit(e){
    
  }
  render() {
    return (
      <Popup open={this.state.open} closeOnDocumentClick onClose={this.closeModal} >
        <div className="Login">
          <a className="close" onClick={this.closeModal}>&times;</a>
          {/* <button class="btn-fb"> <i class="fa fa-fw fa-facebook pull-left" aria-hidden="true"></i>Login with Facebook</button><br/>
          <button class="btn-gp"> <i class="fa fa-fw fa-google-plus pull-left" aria-hidden="true"></i>Login with Google	</button><br/>
					<div class="signup-or-separator">
					  <span class="h6 signup-or-separator--text">or</span>
						  <hr/>
					</div> */}
          <form onSubmit={this.handleSubmit.bind(this)}>
            <h2>Login</h2>
            <div class="form-group">
              <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email"/>  
            </div>
            <div class="form-group">
              <input type="password" class="form-control" id="passwords" placeholder="Password"/>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
          </form>
        </div>
      </Popup>  
    );
  }
}

export default Login;
