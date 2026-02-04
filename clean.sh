#!/bin/bash

# Check if files.txt exists
if [ ! -f "files.txt" ]; then
    echo "Error: files.txt not found in current directory"
    exit 1
fi

# Read each line from files.txt
while IFS=: read -r folder_name class_name; do
    # Skip empty lines
    if [ -z "$folder_name" ]; then
        continue
    fi
    
    echo "================================================"
    echo "Processing folder: $folder_name"
    echo "================================================"
    
    # Check if folder exists
    if [ ! -d "$folder_name" ]; then
        echo "Warning: Folder '$folder_name' does not exist. Skipping..."
        continue
    fi
    
    # Enter the folder
    cd "$folder_name" || {
        echo "Error: Could not enter folder '$folder_name'. Skipping..."
        continue
    }
    
    # Run mvn clean
    echo "Running 'mvn clean' in $folder_name..."
    mvn clean
    
    # Check if reports directory exists
    if [ -d "reports" ]; then
        echo "Cleaning reports directory in $folder_name..."
        
        # Remove all subdirectories inside reports
        find reports -mindepth 1 -maxdepth 1 -type d -exec rm -rf {} +
        
        echo "Reports directory cleaned."
    else
        echo "No reports directory found in $folder_name."
    fi
    
    # Return to parent directory
    cd - > /dev/null
    
    echo ""
    
done < files.txt

echo "================================================"
echo "All folders processed!"
echo "================================================"