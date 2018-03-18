import React, { Component } from 'react';
import ShowUsers from "./screens/users/ShowUsers";
import AddUser from "./screens/users/AddUser";
import LoginSection from "./screens/users/LoginSection";
import $ from 'jquery';
import './App.css';

class App extends Component {
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
          console.log(this.state);
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
          id: 1,
          firstName: "Ashish",
          lastName: "Dadhore"
        },
        {
          id:2,
          firstName: "ABC",
          lastName: "XYZ"
        },
        {
          id:3,
          firstName: "ABC",
          lastName: "XYZ"
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
    let index= users.findIndex(x => x.id == id);
    users.splice(index,1);
    this.setState({users:users});
  }
  render() {
    return (
      <div className="App">
        <div class="container-fluid">
          <LoginSection/>
          {/* <div><ShowUsers handleDelete={this.handleDelete.bind(this)} users={this.state.users}/></div>
          <div><AddUser addUser={this.handleAddUser.bind(this)}/></div> */}
        </div>
      </div>
    );
  }
}

export default App;
