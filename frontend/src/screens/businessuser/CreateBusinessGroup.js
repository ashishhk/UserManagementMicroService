import React, { Component } from 'react';
import ShowUsers from './ShowUsers';

class CreateBusinessGroup extends Component {
    static defaultProps = {
        contactTypeGroup: ['Contact Type', 'Email', 'Mobile']
    }
    constructor() {
        super();
        this.state = {
            businessGroup: {}
        }
    }
    handleSubmit(e) {
        this.setState({
            businessGroup: {
                basicDetails: {
                    name: this.refs.businessName,
                    description: this.refs.description,
                    contact: [{
                        contact: this.refs.contact,
                        type:  this.refs.type,
                    }],
                    address: [{
                        addressLine: this.refs.addressLine,
                        city: this.refs.city,
                        pincode: this.refs.pincode,
                        state: this.refs.state,
                        country: this.refs.country,
                        type: this.refs.type
                    }]
                }
            }
        });
        e.preventDefault();
    }
    render() {
        let contactTypeOption = this.props.contactTypeGroup.map(contactType => {
            return <option key={contactType} value={contactType}>{contactType}</option>
        });
        return (
            <div className="BusinessUserPanel">
                <div>
                    <main id="main" class="site-main main">
                        <section class="section">
                            <div class="container">
                                <div class="row">
                                    <div class="container container--xs">
                                        <div class="woocommerce">
                                            <div id="signup_div_wrapper">
                                                <h5 class="mb-1 text-center">You don't have any business registered with us</h5>
                                                <p class="fs-14 text-gray text-center mb-5">Fill below to register a business</p>
                                                <form onSubmit={this.handleSubmit.bind(this)}>
                                                    <div class="form-group">
                                                        <img class="img-fluid mx-auto d-block mb-3" width="200" height="150" src="https://mdpxstudios.files.wordpress.com/2018/03/videography.jpg" alt="" />
                                                        <div class="input-group">
                                                            <div class="custom-file">
                                                                <input type="file" class="custom-file-input" id="inputGroupFile04" ref="businessImage" />
                                                                <label class="custom-file-label" for="inputGroupFile04">Your Business Display Picture</label>
                                                            </div>
                                                            <div class="input-group-append">
                                                                <button class="btn btn-outline-secondary" type="button">upload</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="col">
                                                            <input type="text" class="form-control" placeholder="Business Name" ref="businessName" />
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="col">
                                                            <label align="left" for="exampleFormControlTextarea1">Business Description</label>
                                                            <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" ref="businessDescription"></textarea>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="form-row">
                                                            <div class="col">
                                                                <label for="exampleFormControlSelect1">Contact</label>
                                                                <select class="form-control" id="exampleFormControlSelect1" ref="contactType">{contactTypeOption}</select>
                                                                <input type="text" class="form-control" placeholder="" ref="contact" />
                                                            </div>
                                                            <div class="col">
                                                                ß       <div class="form-group">
                                                                    <div class="col">
                                                                        <label align="left" for="exampleFormControlTextarea1">Address</label>
                                                                        <input type="text" class="form-control" placeholder="Plot/Flat Number, Street" ref="addressLine" />
                                                                        <input type="text" class="form-control" placeholder="City" ref="city" />
                                                                        <input type="text" class="form-control" placeholder="PinCode" ref="pincode" />
                                                                        <input type="text" class="form-control" placeholder="State" ref="state" />
                                                                        <input type="text" class="form-control" placeholder="Country" ref="country" />
                                                                        <input type="text" class="form-control" placeholder="Address Type" ref="type" />
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <button type="submit" class="btn btn-primary">Submit</button>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
                    </main>
                </div>
            </div>
        );
    }
}

export default CreateBusinessGroup;
