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
        <div>
            <BasicDetail basicDetails={this.props.businessGroup.basicDetails}/>
        </div>
    );
  }
}

export default BusinessGroup;
