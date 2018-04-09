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
        <div>
            <div class="card-columns">
              <div class="card">
                <img class="card-img-top" src="https://mdpxstudios.files.wordpress.com/2018/03/videography.jpg" alt="Card image cap"/>
                <div class="card-body">
                  <h5 class="card-title">"{this.props.basicDetails.name}"</h5>
                  <p class="card-text">{this.props.basicDetails.description}</p>
                  
                </div>
              </div>
            </div>
        </div>
    );
  }
}
export default BasicDetail;