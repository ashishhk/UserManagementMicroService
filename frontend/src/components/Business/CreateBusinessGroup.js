import React, { Component } from 'react';
import ShowUsers from '../User/ShowUsers';

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
                    <main id="main" className="site-main main">
                        <section className="section">
                            <div className="container">
                                <div className="row">
                                    <div className="container container--xs">
                                        <div className="woocommerce">
                                            <div id="signup_div_wrapper">
                                                <h5 className="mb-1 text-center">You don't have any business registered with us</h5>
                                                <p className="fs-14 text-gray text-center mb-5">Fill below to register a business</p>
                                                <form onSubmit={this.handleSubmit.bind(this)}>
                                                    <div className="form-group">
                                                        <img className="img-fluid mx-auto d-block mb-3" width="200" height="150" src="https://mdpxstudios.files.wordpress.com/2018/03/videography.jpg" alt="" />
                                                        <div className="input-group">
                                                            <div className="custom-file">
                                                                <input type="file" className="custom-file-input" id="inputGroupFile04" ref="businessImage" />
                                                                <label className="custom-file-label" htmlFor="inputGroupFile04">Your Business Display Picture</label>
                                                            </div>
                                                            <div className="input-group-append">
                                                                <button className="btn btn-outline-secondary" type="button">upload</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div className="form-group">
                                                        <div className="col">
                                                            <input type="text" className="form-control" placeholder="Business Name" ref="businessName" />
                                                        </div>
                                                    </div>
                                                    <div className="form-group">
                                                        <div className="col">
                                                            <label align="left" htmlFor="exampleFormControlTextarea1">Business Description</label>
                                                            <textarea className="form-control" id="exampleFormControlTextarea1" rows="3" ref="businessDescription"></textarea>
                                                        </div>
                                                    </div>
                                                    <div className="form-group">
                                                        <div className="form-row">
                                                            <div className="col">
                                                                <label htmlFor="exampleFormControlSelect1">Contact</label>
                                                                <select className="form-control" id="exampleFormControlSelect1" ref="contactType">{contactTypeOption}</select>
                                                                <input type="text" className="form-control" placeholder="" ref="contact" />
                                                            </div>
                                                            <div className="col">
                                                                <div className="form-group">
                                                                    <div className="col">
                                                                        <label align="left" htmlFor="exampleFormControlTextarea1">Address</label>
                                                                        <input type="text" className="form-control" placeholder="Plot/Flat Number, Street" ref="addressLine" />
                                                                        <input type="text" className="form-control" placeholder="City" ref="city" />
                                                                        <input type="text" className="form-control" placeholder="PinCode" ref="pincode" />
                                                                        <input type="text" className="form-control" placeholder="State" ref="state" />
                                                                        <input type="text" className="form-control" placeholder="Country" ref="country" />
                                                                        <input type="text" className="form-control" placeholder="Address Type" ref="type" />
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div className="form-group">
                                                        <button type="submit" className="btn btn-primary">Submit</button>
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
