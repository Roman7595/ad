sudo apt update
sudo apt install -y openjdk-17-jdk maven nginx #git
#java -version
#mvn --version
mkdir -p /home/roman/app
sudo chown -R roman:roman /var/www/app
cd /home/roman/app
#git clone https://github.com/sotovdenis/adm.git
cd ad
mvn clean package
sudo cp target/adminka-0.0.1-SNAPSHOT.jar /var/www/app.jar
sudo echo -e "[Unit]\nDescription=Spring Boot App Service\n[Service]\nWorkingDirectory=/var/www\nExecStart=/usr/bin/java -jar app.jar\nRestart=always\nRestartSec=5\nSyslogIdentifier=springapp\nUser=roman\nEnvironment=SPRING_PROFILES_ACTIVE=prod\n[Install]\nWantedBy=multi-user.target" > /etc/systemd/system/springapp.service
sudo systemctl daemon-reload
sudo systemctl enable springapp
sudo systemctl start springapp
#sudo systemctl status springapp
sudo chmod 777 /var/www/app.jar
ls -l /var/www/app.jar
sudo echo -e "server { \n\tlisten 80;\n\tserver_name 192.168.56.101;" > /etc/nginx/sites-available/springapp
sudo echo -e "\tlocation / {\n\t\tproxy_pass http://localhost:5000;\n\t\tproxy_set_header Host \$host;\n\t\tproxy_set_header X-Real-IP \$remote_addr;" >> /etc/nginx/sites-available/springapp
sudo echo -e "\t\tproxy_set_header X-Forwarded-For \$proxy_add_x_forwarded_for;\n\t\tproxy_set_header X-Forwarded-Proto \$scheme;\n\t}\n}" >> /etc/nginx/sites-available/springapp

sudo ln -s /etc/nginx/sites-available/springapp /etc/nginx/sites-enabled
sudo nginx -t
sudo systemctl restart nginx
