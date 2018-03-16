import React, { Component } from 'react';

class addUser extends Component {
  static defaultProps = {
    groups: ['Web','Java','DBA']
  }
  constructor(){
    super();
    this.state = {
      newUser:{}
    }
  }
  handleSubmit(e){
     this.setState({newUser:{
        firstName: this.refs.firstName.value,
        lastName: this.refs.lastName.value,
        //memberOfGroup: this.refs.memberOfGroup.value
      }}, function(){
        this.props.addUser(this.state.newUser);
      });
      e.preventDefault();
  }
  render() {
    let groupOptions = this.props.groups.map(group =>{
        return <option key={group}  value={group}>{group}</option>
    });
    return (
      <div className="addUser">
        <div>
            <h2>Add New User</h2>
            <form onSubmit={this.handleSubmit.bind(this)}>
                <div>
                  <label>First Name</label>
                  <input type="text" ref="firstName"/>
                </div>
                <div>
                  <label>Last Name</label>
                  <input type="text" ref="lastName"/>
                </div>
                <div>
                  <label>Group</label>
                  <select ref="memberOfGroup">{groupOptions}</select>
                </div>
                <div>
                  <input type="submit" value="submit"/>
                </div>
              </form>
        </div>
      </div>
    );
  }
}

export default addUser;