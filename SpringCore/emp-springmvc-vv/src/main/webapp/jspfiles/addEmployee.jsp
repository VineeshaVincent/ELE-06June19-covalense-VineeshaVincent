<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body style="background: lightgoldenrodyellow">
<div class="accordion" id="accordionExample">
        <div class="card">
          <div class="card-header" id="headingOne">
            <h2 class="mb-0">
              <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
              EmployeeInfoBean
              </button>
            </h2>
          </div>
      <form action="./createaccount" method="post">
          <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
            <div class="card-body">
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">ID</label> <input type="text" name="id"
					class="form-control" placeholder="ID">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
					type="text" name="account_number" class="form-control" placeholder="ACCOUNT NUMBER">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">NAME</label> <input type="text"
					name="name" class="form-control" placeholder="NAME">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">EMAIL ID</label> <input type="text" name="email"
					class="form-control" placeholder="EMAIL ID">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">AGE</label> <input type="text" name="age"
					class="form-control" placeholder="AGE">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">DESIGNATION</label> <input
					type="text" name="designation" class="form-control" placeholder="DESIGNATION">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="inputGender">Gender</label> <select id="inputGender" name="gender"
					class="form-control">
					<option selected>--select one--</option>
					<option value="male">male</option>
					<option value="female">female</option>
					<option value="other">other</option>
				</select>
			</div>
			<div class="col">
				<label for="exampleInputEmail1">Date of Birth</label> <input
					type="date" name="dob" class="form-control" placeholder="dd-mm-yyyy">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">SALARY</label> <input type="text" name="salary"
					class="form-control" placeholder="SALARY">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">DEPAETMENT ID</label> <input
					type="text" name="dept_id" class="form-control" placeholder="DEPAETMENT ID">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">PHONE NUMBER</label> <input
					type="text" name="phone" class="form-control" placeholder="PHONE NUMBER">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">MANAGER ID</label> <input
					type="text" name="mngr_id.id" class="form-control" placeholder="MANAGER ID">
			</div>
		</div>
		<div class="row">

			<div class="col-6">
				<label for="exampleInputEmail1">JOINING DATE</label> <input
					type="date" name="joining_date" class="form-control" placeholder="JOINING DATE">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">PASSWORD</label> <input type="text"
					class="form-control" name="password" placeholder="PASSWORD">
			</div>

			<div class="col-6">
				<label for="exampleInputEmail1">CONFIRM PASSWORD</label> <input
					type="text" class="form-control"placeholder="CONFIRM PASSWORD">
			</div>
			<div>
				<br>

			</div>
		</div>
            </div>
          </div>
        </div>
        <div class="card">
          <div class="card-header" id="headingTwo">
            <h2 class="mb-0">
              <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
               EmployeeOtherInfoBean
              </button>
            </h2>
          </div>
          <div id="collapseTwo" class="collapse show"  aria-labelledby="headingTwo" data-parent="#accordionExample">
            <div class="card-body">
    <div class="row">
         
          <div class="col">
                <label for="exampleInputemergenum">Emergency Contact Number</label>
            <input type="text" class="form-control" name="employeeOtherInfoBean.emergency_contact_number" placeholder="Please Enter Emergency Contact Number">
          </div>
          <div class="col">
                <label for="exampleInputmotname">Mother Name</label>
            <input type="text" class="form-control" name= "employeeOtherInfoBean.mother_nm" placeholder="Please Enter Mother Name">
          </div>
        </div>
        <div class="row">
          <div class="col">
                <label for="exampleInputPan">Pan Number</label>
            <input type="text" class="form-control" name="employeeOtherInfoBean.pan_no" placeholder="Please Enter Pan Number">
          </div>
          <div class="col">
                <label for="exampleInputemergeName">Emergency Contact Name</label>
            <input type="text" class="form-control" name=" employeeOtherInfoBean.emergency_contact_name" placeholder="Please Enter Emergency Contact Name">
          </div>
          <div class="col">
                <label for="exampleInputspouse">Spouse Name</label>
            <input type="text" class="form-control" name="employeeOtherInfoBean.spouse_nm" placeholder="Please Enter Spouse Name">
          </div>
        </div>
        <div class="row">
                <div class="col">
                        <label for="inputStatus">Marital Status</label>
                        <select id="inputStatus" class="form-control" name="employeeOtherInfoBean.ismarried">
                          <option selected>Married</option>
                    <option value="married">Married</option>
                    <option value="unmarried">Unmarried</option>
                    <option value="divorcee">Divorcee</option>
                </select>
                </div>
                <div class="col">
                        <label for="inputnationality">Nationality</label>
                        <select id="inputnationality" class="form-control" name="nationality">
                          <option selected>---Select One---</option>
                    <option value="indian">Indian</option>
                    <option value="other">Other</option>
                </select>
                </div>
                <div class="col">
                        <label for="exampleInputpassport">Passport Number</label>
                    <input type="text" class="form-control" placeholder="Please Enter Passport Number" name="employeeOtherInfoBean.passport">
                  </div>
        </div>
        <div class="row">
        <div class="col">
                <label for="inputbloodgrp">Blood Group</label>
                <select id="inputbloodgrp" class="form-control" name="employeeOtherInfoBean.blood_grp">
                  <option selected>---Select One---</option>
            <option value="AB+">AB+</option>
            <option value="AB-">AB-</option>
            <option value="A+">A+</option>
            <option value="A-">A-</option>
            <option value="o+">o+</option>
            <option value="o-">o-</option>
        </select>
        </div>
        <div class="col">
                <label for="inputreligion">Religion</label>
                <select id="inputreligion" class="form-control" name="employeeOtherInfoBean.religion">
                  <option selected>---Select One---</option>
            <option value="hindu">Hindu</option>
            <option value="christian">Christian</option>
            <option value="muslim">Muslim</option>
        </select>
        </div>
        <div class="col">
                <label for="exampleInputaadhar">Aadhar Number</label>
            <input type="text" class="form-control" placeholder="Please Enter Aadhar Number" name="employeeOtherInfoBean.adhar">
          </div>
        </div>
        <div class="row">
                <div class="col">
                        <label for="inputphysicallych">Physically Challnged</label>
                        <select id="inputphysicallych" class="form-control" name="employeeOtherInfoBean.ischallenged">
                          <option selected>---Select One---</option>
                    <option value="yes">Yes</option>
                    <option value="no">No</option>
                </select>
                </div>
                <div class="col">
                  <label for="exampleInputefathername">Father Name</label>
              <input type="text" class="form-control" placeholder="Please Enter Father Name" name="employeeOtherInfoBean.father_nm">
            </div>
            </div>
        <br>

			</div>
		</div>
            </div>
          </div>
   
           <div class="card">
          <div class="card-header" id="headingFour">
            <h2 class="mb-0">
              <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
               EmployeeAddressInfoBean(Present)
              </button>
            </h2>
          </div>
          <div id="collapseFour" class="collapse-show" aria-labelledby="headingFour data-parent="#accordionExample">
            <div class="card-body">
            
            <div class="row">
          <div class="col">
                <label for="exampleInputAddresssType">AddressType</label>
            <input type="text" class="form-control" placeholder="Enter AddressType" name="addressInfoBean[0].addressPKBean.address_type">
         
        </div>
          <div class="col">
                <label for="exampleInputCity">City</label>
            <input type="text" class="form-control" placeholder="Enter City" name="addressInfoBean[0].city">
        </div>
        </div>
        <div class="row">
          <div class="col">
                <label for="exampleInputState">State</label>
            <input type="text" class="form-control" placeholder="Enter State" name="addressInfoBean[0].state">
         
        </div>
          <div class="col">
                <label for="exampleInputAddress1">Address1</label>
            <input type="text" class="form-control" placeholder="Enter Address Line1" name="addressInfoBean[0].address1">
          </div>
          </div>
            <div class="row">
          <div class="col">
                <label for="exampleInputCountry">Country</label>
            <input type="text" class="form-control" placeholder="Enter Country" name="addressInfoBean[0].country">
       
        </div>
        
                <div class="col">
                    <label for="exampleInputAddress2">Address2</label>
                    <input type="text" class="form-control" placeholder="Enter Address Line2" name="addressInfoBean[0].address2">
                </div>
                </div>
                <div class="row">
                <div class="col">
                        <label for="exampleInputPincode">Pincode</label>
                    <input type="text" class="form-control" placeholder="Enter Pincode" name="addressInfoBean[0].pincode">
                </div>
                <div class="col">
                        <label for="exampleInputLandmark">Landmark</label>
                  <input type="text" class="form-control" placeholder="Enter Landmark" name="addressInfoBean[0].landmark">
                    </div>    
			</div>
            </div>
         <br>

			</div>
		</div>
            </div>
          </div>
   
                      <div class="card">
          <div class="card-header" id="headingnine">
            <h2 class="mb-0">
              <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapsenine" aria-expanded="false" aria-controls="collapsenine">
               EmployeeAddressInfoBean(permenent)
              </button>
            </h2>
          </div>
          <div id="collapsenine" class="collapse" aria-labelledby="headingnine data-parent="#accordionExample">
            <div class="card-body">
            <div class="row">
          <div class="col">
                <label for="exampleInputAddresssType">AddressType</label>
            <input type="text" class="form-control" placeholder="Enter AddressType" name="addressInfoBean[1].addressPKBean.address_type">
          </div>
       
          <div class="col">
                <label for="exampleInputCity">City</label>
            <input type="text" class="form-control" placeholder="Enter City" name="addressInfoBean[1].city">
          </div>
        </div>
        <div class="row">
          <div class="col">
                <label for="exampleInputState">State</label>
            <input type="text" class="form-control" placeholder="Enter State" name="addressInfoBean[1].state">
          </div>
        
          <div class="col">
                <label for="exampleInputAddress1">Address1</label>
            <input type="text" class="form-control" placeholder="Enter Address Line1" name="addressInfoBean[1].address1">
          </div>
          </div>
                  <div class="row">
          <div class="col">
                <label for="exampleInputCountry">Country</label>
            <input type="text" class="form-control" placeholder="Enter Country" name="addressInfoBean[1].country">
        </div>
       
        
                <div class="col">
                    <label for="exampleInputAddress2">Address2</label>
                    <input type="text" class="form-control" placeholder="Enter Address Line2" name="addressInfoBean[1].address2">
                </div>
                </div>
                <div class="row">
                <div class="col">
                        <label for="exampleInputPincode">Pincode</label>
                    <input type="text" class="form-control" placeholder="Enter Pincode" name="addressInfoBean[1].pincode">
                </div>
          
                    <div class="col-6">
                        <label for="exampleInputLandmark">Landmark</label>
                  <input type="text" class="form-control" placeholder="Enter Landmark" name="addressInfoBean[1].landmark" >
                    </div>    
			</div>
		 <br>

			</div>
		</div>
            </div>
          </div>
      
   
		
                    <div class="card-header" id="headingFive">
            <h2 class="mb-0">
              <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
               EmployeeEducationalInfoBean(1)
              </button>
            </h2>
          </div>
          <div id="collapseFive" class="collapse" aria-labelledby="headingFive data-parent="#accordionExample">
            <div class="card-body">
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Education Type</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[0].educationalPKBean.educational_type" value=""
                                placeholder="Enter Education Type">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Degree Type</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[0].degree_type" value=""
                                placeholder="Enter Degree Type">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Branch</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[0].branch" value=""
                                placeholder="Enter Degree Branch">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">College Name</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[0].college_name" value=""
                                placeholder="Enter College Name">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">University</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[0].university" value=""
                                placeholder="Enter University Name">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Year Of Passing</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[0].yop" value=""
                                placeholder="dd-mm-yyyy">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Percentage</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[0].percentage" value=""
                                placeholder="Enter Percentage">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Location</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[0].location" value=""
                                placeholder="Enter College Location">
                        </div>
                       </div>
               <br>

			</div>
		</div>
            </div>
          </div>
		
   


                        <div class="card-header" id="headingsix">
            <h2 class="mb-0">
              <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapsesix" aria-expanded="false" aria-controls="collapsesix">
               EmployeeEducationalInfoBean(2)
              </button>
            </h2>
          </div>
          <div id="collapsesix" class="collapse" aria-labelledby="headingsix data-parent="#accordionExample">
            <div class="card-body">

                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Education Type</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[1].educationalPKBean.educational_type" value=""
                                placeholder="Enter Education Type">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Degree Type</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[1].degree_type" value=""
                                placeholder="Enter Degree Type">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Branch</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[1].branch" value=""
                                placeholder="Enter Degree Branch">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">College Name</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[1].college_name" value=""
                                placeholder="Enter College Name">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">University</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[1].university" value=""
                                placeholder="Enter University Name">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Year Of Passing</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[1].yop" value=""
                                placeholder="dd-mm-yyyy">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Percentage</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[1].percentage" value=""
                                placeholder="Enter Percentage">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Location</span>
                            <input id="login-username" type="text" class="form-control" name="educationalInfoBean[1].location" value=""
                                placeholder="Enter College Location">
                        </div>
         <br>

			</div>
		</div>
            </div>
          </div>
   

	
               <div class="card-header" id="headingseven">
            <h2 class="mb-0">
              <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseseven" aria-expanded="false" aria-controls="collapseseven">
               EmployeeExperienceInfoBean(1)
              </button>
            </h2>
          </div>
          <div id="collapseseven" class="collapse" aria-labelledby="headingsix data-parent="#accordionExample">
            <div class="card-body">
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Company Name</span>
                            <input id="login-username" type="text" class="form-control" name="experienceInfoBean[0].experiencePKBean.company_name" value=""
                                placeholder="Enter Company Name">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Designation</span>
                            <input id="login-username" type="text" class="form-control" name="experienceInfoBean[0].designation" value=""
                                placeholder="Enter Designation">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Joining Date</span>
                            <input id="login-username" type="text" class="form-control" name="experienceInfoBean[0].joining_date" value=""
                                placeholder="dd-mm-yyyy">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Leaving Date</span>
                            <input id="login-username" type="text" class="form-control" name="experienceInfoBean[0].leaving_Date" value=""
                                placeholder="dd-mm-yyyy">
                        </div>
       <br>

			</div>
		</div>
            </div>
          </div>
       
     <div class="card-header" id="headingeight">
            <h2 class="mb-0">
              <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseeight" aria-expanded="false" aria-controls="collapseeight">
               EmployeeExperienceInfoBean(2)
              </button>
            </h2>
          </div>
          <div id="collapseeight" class="collapse" aria-labelledby="headingsix data-parent="#accordionExample">
            <div class="card-body">
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Company Name</span>
                            <input id="login-username" type="text" class="form-control" name="experienceInfoBean[1].experiencePKBean.company_name" value=""
                                placeholder="Enter Company Name">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Designation</span>
                            <input id="login-username" type="text" class="form-control" name="experienceInfoBean[1].designation" value=""
                                placeholder="Enter Designation">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Joining Date</span>
                            <input id="login-username" type="text" class="form-control" name="experienceInfoBean[1].joining_date" value=""
                                placeholder="dd-mm-yyyy">
                        </div>
                        <div style="margin-bottom: 25px" class="input-group">
                            <span class="input-group-addon">Leaving Date</span>
                            <input id="login-username" type="text" class="form-control" name="experienceInfoBean[1].leaving_Date" value=""
                                placeholder="dd-mm-yyyy">
                        </div>
           <div class="row">
           <div class="col-1"></div>
           <div class=col-3>
                        <br>
                          <button  type="submit"class="form-control form-control btn btn-outline-secondary"> Submit</button>

          </div>
          <div class="col-3">
          <br>
                          <button type="reset" class="form-control form-control btn btn-outline-success"  >reset</button>
                      </div>
          </div>
                     
                           
      </form>
</body>
</html>