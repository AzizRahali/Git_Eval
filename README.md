# Java project using Git

welcome to our Java project, this readme file will help you how to get started , collaborate and use Git commands
effectively.

## Getting Started

1. **Clone** the repository to your local machine.

````bash
git clone https://github.com/AzizRahali/Git_Eval.git
````

2. **Compile and run** the project using the following commands:

````bash
cd Git_Eval
cd src/main/java
javac tn/esprit/*.java
java tn.esprit.Main
````

## Collaborate

1. **Fork** the repository to your GitHub account.

   - Click on the fork button on the top right corner of the repository page.

2. **Clone** the repository to your local machine.

````bash
git clone https://github.com/<your_username>/Git_Eval.git
````

3. **Create a branch** for your changes.

````bash
git checkout -b <branch_name>
````

4. **Make your changes** to the project.


5. **Commit** your changes.

````bash
git commit -m "your message"
````

6. **Push** your changes to your forked repository.

````bash
git push origin <branch_name>
````

7. Create a **pull request** to the original repository.

## Git Commands

- **git clone** : Clone a repository into a new directory.
```bash
git clone <repository_url>
```
- **git add** : Add file contents to the index.
```bash
git add <file_name>
```
- or to add all files
```bash
git add .
```
- **git commit** : Record changes to the repository.
```bash
git commit -m "your message"
```
- **git push** : Update remote refs along with associated objects.
```bash
git push origin <branch_name>
```
- **git pull** : Fetch from and integrate with another repository or a local branch.
```bash
git pull origin <branch_name>
```
- **git checkout** : Switch branches or restore working tree files.
```bash
git checkout <branch_name>
```
- **git branch** : List, create, or delete branches.
```bash
git branch 
```
- **git status** : Show the working tree status.
```bash
git status
```
- **git log** : Show commit logs.
```bash
git log
```
- **git reset** : Reset current HEAD to the specified state.
```bash
git reset <commit_id>
```
- **git tag** : Create, list, delete or verify a tag object signed with GPG.
```bash
git tag <tag_name>
```
- **git fetch** : Download objects and refs from another repository.
```bash
git fetch
```
## Contribution
If you'd like to contribute to this project, please fork the repository, make your changes, and create a pull request
Your contributions are welcome!

## License
This project is licensed under the MIT License - see the `LICENSE` file for details
## Authors
- Melek Homrani
- Mohamed Aziz Rahali

## Contact
- Melek Homrani: melek.homrani@esprit.tn
- Mohamed Aziz Rahali: mohamedaziz.rahali@esprit.tn