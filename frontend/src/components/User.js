import React, { Component } from 'react';

class User extends Component {
  constructor(){
    super();
    this.state = {
        name: "DEFAULT_USER"
    }
  }
  handleDelete(id){
      this.props.handleDelete(id);
  }
  render() {
    return (
        <li>
            {this.props.user.id} {this.props.user.firstName} {this.props.user.lastName} <a href="#" onClick={this.handleDelete.bind(this,this.props.user.id)}>Delete</a>
        </li>
    );
  }
}

export default User;
