<div id="top"></div>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/paoloDAlessandro/SpringBootProject/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/paoloDAlessandro/SpringBootProject/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/paoloDAlessandro/SpringBootProject/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/paoloDAlessandro/SpringBootProject/issues
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/paolo-dalessandro-fullstack-developer/



<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/paoloDAlessandro/SpringBootProject/">
    <img src="imgs/logo.png" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">Auctive</h3>

  <p align="center">
    Auctive is a virtual auction platform that allows you to sell any kind of object, physical or digital. The seller creates the auction by entering information about the product that is posted to the bulletin board. The buyer browses the bulletin board and looks for the product that suits him, proposes an offer and if it is the best he wins the product.
    <br />
    <a href="https://github.com/PaoloDAlessandro/SpringBootProject"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="http://dev-auctive.sa-projects.it/" target = "_blank">View Demo</a>
    ·
    <a href="https://github.com/paoloDAlessandro/SpringBootProject/issues">Report Bug</a>
    ·
    <a href="https://github.com/paoloDAlessandro/SpringBootProject/issues">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

<p align="right">(<a href="#top">back to top</a>)</p>



### Built With

* [HTML](https://html.com/)
* [CSS](https://www.w3.org/Style/CSS/Overview.en.html)
* [JavaScript](https://www.javascript.com/)
* [SpringBoot](https://spring.io/)
* [SQL](https://www.mysql.com/)
* [JQuery](https://jquery.com)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

First of all you have to config. the repository locally on your machine, please open visual studio code, create a new empty folder and clone on it the repository (https://github.com/PaoloDAlessandro/SpringBootProject).

* code
  ```sh
  git clone https://github.com/PaoloDAlessandro/SpringBootProject
  ```

### Developer configuration

For an error during repository initialization, the repo is not in the main folder of the project but in a sub-folder. No access it:
* code
  ```sh
  cd SpringBootProject
  ```
 
 After that you have to config. the branch that you have locally on your machine, you need three branches:
 
 * main (already present)
 * dev
 * dev-your_name
 
 * <b>dev:</b>
     ```sh
    git checkout -t origin/dev
    ```
    
 * <b>dev-your_name:</b>
     ```sh
    git checkout -t origin/dev-your_name
    ```
    
<p><b>ALERT:</b> if you don't know which is your_name variable, there is a list at <a href = "#your_name">the end of this file</a></p>


To switch to dev branch you can use this code:
     ```sh
    git checkout dev
    ```
    
To switch to dev-your_name branch you can use this code:
     ```sh
    git checkout dev-your_name
    ```
 
 NOTE: remember to always work on dev-your_name branch and NOT in dev or main branch.
 
 
### Branches explanation:

<ul>
  <li><b>main:</b> the main branch is that one customers view, so only the well working changes can be pushed here (after all team components review and approval)
   <br> The destination address of this branch can be reached at <a href = "http://auctive.sa-projects.it/">this address</a>
  </li>
  <br>
  <li><b>dev:</b> the dev branch is that one developers use and share to view all the changes together, you can push here all the features you have developed but they have to work well at least alone (no approval of any of the team components is request). <br> The destination addres of this branch can be reached at <a href = "http://dev-auctive.sa-projects.it/">this address</a>
 </li>
  <br>
 <li><b>dev-your_name: </b> the dev-your-name branch is that one single developer use to test features and fixs stuff, you can push here all you want to push, to test the stuffs you are developing you can use Live server of visual studio (the button on the bottom-right corner ["Go Live"])</li>
</ul>

### Branches usage:

Always work in dev-your-name branch, when you have a working feature, first of all push it on your branch creating a commit and using:
   ```sh
   git push
   ```
<br>
Done that you can push the feature on dev branch, to do that change the branch to dev branch with:

   ```sh
   git checkout dev
   ```
<br>

So fetch:
    
   ```sh
   git fetch
   ```
<br>

Now you can rebase dev onto your dev branch:

   ```sh
   git rebase dev-your_name
   ```
   
<br>

Then push:

   ```sh
   git push
   ```

<!-- ROADMAP -->
## Roadmap

- [ ] Design & develop Front-end
- [ ] Structure & develop Back-end

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* [Paolo D'Alessandro](www.linkedin.com/in/paolo-dalex)
* [Jimwell Fulgencio](https://www.linkedin.com/in/jimwellf/)
* [Robert Hanu](https://www.linkedin.com/in/robert-hanu/)
* [Nicholas Santoro](https://www.linkedin.com/in/nicholas-santoro-3569a3225/)
* [Marco Stefani](https://www.linkedin.com/in/marco-stefani-90099b225/)


<p align="right">(<a href="#top">back to top</a>)</p>

## Your_name code

<div id = "your_name">
  <ul>
  <li>Robert -> robert</li>
  <li>Jimwell -> jim</li>
  <li>Marco -> marco</li>
  <li>Paolo -> paolo</li>
  <li>Nicholas -> nicholas</li>
  </ul>
</div>

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo_name.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo_name/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo_name/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
[product-screenshot]: images/screenshot.png
