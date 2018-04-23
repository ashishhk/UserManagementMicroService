import React from 'react';
import classes from './Models.css';

const basicDetail = (props) => ({
  render() {
    return (
        <div className={classes.BasicDetailsCards}>
            <img class="card-img-top" src="https://mdpxstudios.files.wordpress.com/2018/03/videography.jpg" alt="Card image cap" />
            <div class="card-body">
              <h5 class="card-title">"{props.basicDetails.name}"</h5>
              <p class="card-text">{props.basicDetails.description}</p>
              <h6>{props.basicDetails.address.city}</h6>
              <a href="#">more</a>
            </div>
        </div>
    );
  }
}
);

export default basicDetail;