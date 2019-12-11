#!/bin/bash

mongo listings --eval "printjson(db.HotelListing.remove({}))"
chmod +x ./csvcut
./csvcut -d ',' -q \" -f 2,4,5,6,7,8,9,10 data/listings.csv > data/extracted.csv
mongoimport -d listings -c HotelListing --type csv --file data/extracted.csv --headerline --mode merge
