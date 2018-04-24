import React, { Component } from 'react';
import Popup from "reactjs-popup";
import CaptureBusinessData from "./CaptureBusinessData";

class SignUp extends Component {
  constructor(){
    super();
    this.state = {
        open: false
    }
  }
  componentWillReceiveProps(){
    this.setState({open:this.props.signUpClick});
  }
  closeModal = () => {
    this.setState({ open: false });
    this.props.setDisplayFalse();
  };
  handleSubmit(e){
    console.log("SignUp Clicked in Sign Up form");
  }
  render() {
    return (
      <Popup open={this.state.open} closeOnDocumentClick onClose={this.closeModal}>
        <div className="SignUp">
            <a className="close" onClick={this.closeModal}>&times;</a>
            <p class="text-primary">Fill in some information and get some more customers to delight your business.. :)</p>
            <form onSubmit={this.handleSubmit.bind(this)}>
              <div class="form-row">
                <div class="form-group col-md-6">
                  <input type="businessEmail" class="form-control" id="inputEmail4" placeholder="Business Email"/>
                </div>
              </div>
              <div class="form-row">
                <div class="form-group col-md-6">
                  <input type="password" class="form-control" id="password" placeholder="Password"/>
                </div>
              </div>
              <div class="form-row">
                  <div class="form-group col-md-6">
                  <input type="password" class="form-control" id="password" placeholder="Password"/>
                </div>
              </div>
              <button type="submit" class="btn btn-primary">Proceed</button>
            </form>
            <CaptureBusinessData />
          </div>
      </Popup>
    );
  }
}

export default SignUp;