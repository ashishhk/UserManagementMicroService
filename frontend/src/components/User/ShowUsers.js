import React, { Component } from 'react';
import User from "../../components/models/User";
import $ from 'jquery';
import classes from './User.css';

class ShowUsers extends Component {
  constructor(){
    super();
    this.state = {
      users:[]
     }
  }

  getUsers(){
    $.ajax({
      url:'http://localhost:8080/rest/v1/user/getAll',
      method: 'GET',
      dataType: 'json',
      cache:false,
      success: function(data){
          this.setState({users:data},function(){
        });
      }.bind(this),
      error: function(xhr,status,error){
        console.log(error);
      }
    });
  }
  componentDidMount(){
    this.getUsers();
  }
  /*lifecycle method: hits everytime a component is re-rendered
    usually used when outside data to be loaded such as API response data
    willMount or DidMount
  */
  componentWillMount(){
      this.setState({users: [
        {
          userName: "DEFAULT",
          password: "PASSWORD",
          parentUser: "DEFAULT",
          type: "GeneralUser"
        }
      ]
    });
    this.getUsers();
  }

  handleAddUser(user){
    let users=this.state.users;
    users.push(user);
    this.setState({users:users});
  }
  handleDelete(id){
    let users =this.state.users;
    let index= users.findIndex(x => x.id === id);
    users.splice(index,1);
    this.setState({users:users});
  }

  render() {
    let users;
    if(this.state.users){
        users= this.state.users.map(user => {
          return(
            <div key={user.userName}><User  handleDelete={this.handleDelete.bind(this)} user={user}/></div>
          );
        });
    }
    return (
      <div className={classes.UserSection}>
        <div>
            <h3>Users</h3>
            {users}
        </div>
      </div>
    );
  }
}

export default ShowUsers;
