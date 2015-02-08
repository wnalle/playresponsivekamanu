# ics-play-java

This is a revised version of the Activator 'play-java' template system which conforms to the ICS software engineering coding standards.

To use it, first create an empty GitHub repo and clone to your desktop.

Next, cd into your new repo and set this repo as the upstream master:

    git remote add upstream https://github.com/ics613s15/ics-play-java.git

Finally, merge the contents of ics-play-java into your new empty repo:

    git fetch upstream
    git merge upstream/master

Now your repo will contain the ics-play-java repo.

Edit the build.sbt file to change the name to your new project.