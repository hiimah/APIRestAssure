Feature: reqresin

  @POST-SuccessLogin
  Scenario: Success POST login
    When user send POST login request to reqresin with body json "login-success.json"
    Then response status code should be 200
    And response body with jsonPath "token" must be string
    And response structure should match json schema "login.json"

  @POST-FailedLogin
  Scenario: POST failed login
    When user send POST login request with body "login-failed.json"
    Then response status should be 400

  @POST-SuccessRegister
  Scenario: POST success register
    When user send POST register with body "register-success.json"
    Then response status should be 200
    And response body with jsonPath "id" and "token"
    And response body should be equal with jsonSchema "register.json"

  @POST-FailedRegister
  Scenario: POST failed register
    When user send POST register with body "register-failed.json"
    Then response status should be 400

#  @GET-User
#  Scenario: Success GET users
#    When user send GET Users request to reqresin
#    Then response status code should be 200
#    And response structure should match json schema "users.json"
#
#  @GET-FailedUser
#  Scenario: GET failed single user
#    When user send GET single user with "id" number 13
#    And response status should be 404
#
#  @PUT-UpdateUser
#  Scenario: PUT update user
#    When user send PUT to update user
#    Then response status should be 200
#    And response body "name", "job" and "domisili"
#    And response body jsonSchema "update-user.json"