import React, { Component } from 'react';
import BusinessGroup from "../../components/models/BusinessGroup";
import $ from 'jquery';

class ShowBusinesses extends Component {
  constructor(){
      super();
      this.state = {
          businessGroup: {}
      }
  }

  init(){
    this.loadBusinesses();
  }
  loadBusinesses(){
    $.ajax({
        url:'http://localhost:8080/rest/v1/businessgroup/getById/1',
        method: 'GET',
        dataType: 'json',
        cache:false,
        success: function(data){
          console.log(data);
          this.setState({businessGroup:data});
        }.bind(this),
        error: function(xhr,status,error){
          console.log(error);
        }
      });
  }
  componentDidMount(){
    this.init();
  }

  componentWillMount(){
    this.init();
  }

  handleDelete(id){
    this.props.handleDelete(id);
  }
  render() {
    if(this.state.businessGroup.basicDetails){
      console.log(this.state.businessGroup.basicDetails);
    }
    return (
      <div className="ShowBusinesses">
        <div>
            <h3>Your Business List</h3>
            <BusinessGroup businessGroup={this.state.businessGroup}/>
        </div>
      </div>
    );
  }
}

export default ShowBusinesses;
