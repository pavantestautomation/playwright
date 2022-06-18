Feature: Header

Business Need: define the business need for this feature

  Background: home page should be visible to user
    Given the Home page
    And user should see Today page by default
    And user should see Today icon highlighted by default

  Scenario: verify the burger menu
    When user click on burger menu
    Then user should see burger menu items

  Scenario: verify the mail logo
    When user click on the mail logo
    Then user should see home page reloaded

  Scenario Outline: verify the header menu section
    When user click on <Header Menu> icon
    Then user should see <Header Menu> page
    And user should see <Header Menu> page highlighted

    Examples:
      | Header Menu |
      | Today       |
      | Newspaper   |
      | Best Of     |
      | Puzzles     |

  Scenario: verify the header section order
    Then user should see header section in following order
      | Burger menu |
      | Mail logo   |
      | Today       |
      | Newspaper   |
      | Best Of     |
      | Puzzles     |
      | Rewards     |
      | Search      |
      | Sign In     |
      | Subscribe   |


