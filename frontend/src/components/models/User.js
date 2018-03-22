import React, { Component } from 'react';

class User extends Component {
  constructor(){
    super();
    this.state = {
        userName: "DEFAULT_USER"
    }
  }
  handleDelete(id){
      this.props.handleDelete(id);
  }
  render() {
    return (
        <li>
            {this.props.user.userName} {this.props.user.parentUser} {this.props.user.type} <a href="#" onClick={this.handleDelete.bind(this,this.props.user.id)}>Delete</a>
        </li>
    );
  }
}

export default User;
