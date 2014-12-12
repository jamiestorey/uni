using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace ChristmasTree
{
    public partial class Form1 : Form
    {
        int treeHeight = 17;
        string treeChar = "*";

        public Form1()
        {
            InitializeComponent();
        }

        private void btnMakeTree_Click(object sender, EventArgs e)
        {
            treeChar = txtTreeChar.Text;
            treeHeight = Convert.ToInt32(txtTreeHeight.Text);
            
            txtTree.SelectionAlignment = HorizontalAlignment.Center;
            //txtTree.ForeColor = Color.Green;
            txtTree.ForeColor = colorDialog1.Color;
            DrawTree();
        }

        public void DrawTree()
        {
            //first loop
            for (int i = 0; i < treeHeight; i++)
            {
                //second loop
                for (int j = 0; j < treeHeight - 1 - i; j++)
                {
                   // txtTree.AppendText(" ");
                }
                //third loop
                for (int k = 0; k < i * 2 + 1; k++)
                {
                    txtTree.AppendText(treeChar);
                }
                txtTree.AppendText("\n");
                txtTree.ScrollToCaret();
            }
        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            txtTree.Text = "";
        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            colorDialog1.ShowDialog();
            this.ForeColor = colorDialog1.Color;
        }
    }
}