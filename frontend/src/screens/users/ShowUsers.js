import React, { Component } from 'react';
import User from "../../components/User"

class ShowUsers extends Component {
  handleDelete(id){
    this.props.handleDelete(id);
  }
  render() {
    let users;
    if(this.props.users){
        users= this.props.users.map(user => {
          return(
            <div><User handleDelete={this.handleDelete.bind(this)} key={user.id} user={user}/></div>
          );
        });
    }
    return (
      <div className="ShowUsers">
        <div>
            <h3>Users</h3>
            <h3>{users}</h3>
        </div>
      </div>
    );
  }
}

export default ShowUsers;
