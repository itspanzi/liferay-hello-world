#!/bin/zsh

echo "Will build war"
mvn clean compiler:compile war:war
echo "Will copy war"
cp target/list_portlet-0.0.1-SNAPSHOT.war ~/projects/liferay/liferay-portal-6.2-ee-sp8/deploy
echo "Done"