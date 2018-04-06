import React, { Component } from 'react';

class BasicDetail extends Component {
constructor(props){
    super(props);
}
componentWillMount(){
    
}
render() {
    // console.log(this.props.basicDetails);
    return (
        <li>Business Name {this.props.basicDetails}</li>
    );
  }
}
export default BasicDetail;