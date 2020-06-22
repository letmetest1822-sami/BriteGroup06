Feature:


  @navigate
  Scenario Outline: user should navigate to <tab>
    Given the user is logged in with proper credentials
    When the user clicks on "<tab>"

    Examples:
      | tab            | subTitle              |
      | Discuss        | #Inbox                |
      | Calendar       | Meetings              |
      | Notes          | Notes                 |
      | Contacts       | Contacts              |
      | Events         | Events                |
      | Employees      | Employees             |
      | Leaves Summary | Leaves Summary        |
      | Expenses       | My Expenses to Submit |
      | Lunch          | New                   |
      | Maintenance    | Maintenance Teams     |
      | Dashboards     | My Dashboard - Odoo   |
