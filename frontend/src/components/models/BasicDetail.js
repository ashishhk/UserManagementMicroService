import React, { Component } from 'react';

class BasicDetail extends Component {
    
componentDidMount(){
    console.log(this.props.basicDetails);
}
render() {
    return (
        <li>Business Name {this.props.basicDetails.name} Description {this.props.basicDetails.description}</li>
    );
  }
}
export default BasicDetail;