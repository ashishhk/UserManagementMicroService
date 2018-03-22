import React, { Component } from 'react';
import Business from "../../components/models/Business"
import $ from 'jquery';

class ShowBusinesses extends Component {
  constructor(){
      super();
      this.state = {
          businessGroup:{},
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
          this.setState({businessGroup:data},function(){
            console.log(this.state);
          });
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
    return (
      <div className="ShowBusinesses">
        <div>
            <h3>Your Business List</h3>
            <h3>{this.state.businessGroup.basicDetails.name}</h3>
        </div>
      </div>
    );
  }
}

export default ShowBusinesses;
