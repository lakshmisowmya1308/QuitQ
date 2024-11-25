import axios from "axios";
const BASE_URL = "http://localhost:8080/api/v1/quitq/customer";

class CustomerService {

  //get customer by email
  getCustomerByEmail(email, token) {
    return axios({
      method: "get",
      url: BASE_URL + "/email?email=" + email,
      responseType: "json",
      headers: {
        "Access-Control-Allow-Origin": "*",
        Authorization: `Bearer ${token}`,
      },
    });
  }

  //update customer by email
  updateCustomer(customerRegistrationobj, email,token) {
    return axios({
      method: "put",

      url: BASE_URL + "/updatecustomer?email=" + email,
      data: customerRegistrationobj,

      headers: {
        "Access-Control-Allow-Origin": "*",
        Authorization: `Bearer ${token}`,
      },
    });
  }
}

export default new CustomerService();
