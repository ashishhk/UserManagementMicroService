import React, { Component } from 'react';
import BasicDetail from "./BasicDetail";

class BusinessGroup extends Component {
  constructor(props){
    super(props);
    this.state = {
        userName: "DEFAULT_USER"
    }
  }
  componentDidMount(){
   
  }
  
  render() {
    //console.log(this.props.businessGroup.basicDetails);
    return (
            <BasicDetail basicDetails={this.props.businessGroup.basicDetails}/>
    );
  }
}

export default BusinessGroup;
