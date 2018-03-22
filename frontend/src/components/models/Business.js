import React, { Component } from 'react';

class Business extends Component {
  constructor(){
    super();
    this.state = {
        name: "DEFAULT_BUSINESS"
    }
  }
  handleDelete(id){
      this.props.handleDelete(id);
  }
  render() {
    return (
        <li>
            {this.props.business.id} {this.props.business.basicDetails.name} {this.props.business.basicDetails.description} <a href="#" onClick={this.handleDelete.bind(this,this.props.business.id)}>Delete</a>
        </li>
    );
  }
}

export default Business;
