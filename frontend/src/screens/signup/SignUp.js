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
                <div class="form-group col-md-6">
                  <input type="password" class="form-control" id="password" placeholder="Password"/>
                </div>
              </div>
              <div class="form-group">
                <input type="text" class="form-control" id="businessName" placeholder="Business Name"/>
              </div>
              <div class="form-group">
                <input type="text" class="form-control" id="serviceArea" placeholder="Where do you provide your services"/>
              </div>
              <div class="form-row">
                <div class="form-group col-md-6">
                  <input type="text" class="form-control" id="officeLocation" placeholder="Your office Location"/>
                </div>
                <div class="form-group col-md-6">
                  <input type="text" class="form-control" id="sample" placeholder="sample"/>
                </div>
              </div>
              <div class="form-row">
                <label class="text-secondary">Please Select Your Businesses</label>
              </div>
              <div class="form-row">
                <div class="form-group col-md-2">
                  <input class="form-check-input" type="checkbox" id="eventHall"/>
                  <label class="form-check-label" htmlFor="gridCheck">Event Hall</label>
                </div>
                <div class="fform-group col-md-2">
                  <input class="form-check-input" type="checkbox" id="caterer"/>
                  <label class="form-check-label" htmlFor="gridCheck">Caterer</label>
                </div>
                <div class="form-group col-md-2">
                  <input class="form-check-input" type="checkbox" id="photographer"/>
                  <label class="form-check-label" htmlFor="gridCheck">Photographer</label>
                </div>
              </div>
              <div class="form-group">
                <div class="form-check">
                  <input class="form-check-input" type="checkbox" id="gridCheck"/>
                  <label class="form-check-label" htmlFor="gridCheck">
                    Check me out
                  </label>
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