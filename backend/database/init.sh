#datos de inicializacion , collections: data --> data_valle.csv
mongoimport -d icfes_valle -c estudiante --type=csv --file /app/data_valle.csv --headerline
